package com.point.mybatis1st.test;

import com.point.mybatis1st.mapper.User;
import com.point.mybatis1st.model.UserModel;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Created by Point on 2017/6/19.
 */
public class TestUser {

    @Test
    public void testUser() {
        try

        {
            String resource = "SqlMapConfig.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            SqlSession sqlSession = sqlSessionFactory.openSession();

            User user = sqlSession.getMapper(User.class);

            UserModel userModel = user.findOne(1);
            System.out.println(userModel);

            List<UserModel> userModels = user.findAll();
            System.out.println(userModels);

        } catch (
                IOException e)

        {
            e.printStackTrace();
        }
    }
}
