package com.globant;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SecondPoint
{

    @BeforeClass
    public void message()
    {
        System.out.println("Second point started");
    }

    @Test(priority = 0)
    @Parameters({"username", "password"})
    public void login(String username, String password)
    {
        System.out.println("Login with credentials : \n" +
                "Username : "+username+" Password : "+password);
    }

    @Test( priority = 1,description = "Check if we go to my Profile")
    public void goToMyProfile()
    {
        System.out.println("Going to My profile");
    }

    @Test( priority = 2,description = "Check if we go to edit profile")
    public void goToEditProfile()
    {
        System.out.println("Going to edit profile");
    }

    @Test( priority = 3,description = "Check if we changed the profile photo")
    public void changePhoto()
    {
        System.out.println("Changed Photo");
    }

    @Test(priority = 4, description = "Log out")
    @Parameters({"username"})
    public void logout(String username)
    {
        System.out.println(username+" has logged out");
    }

    @AfterClass
    public void saveLogs()
    {
        System.out.println("Recorded logs were saved");
    }
}
