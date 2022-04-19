package com.globant;


import org.testng.annotations.*;

/**
 * Unit test for simple App.
 */
public class FirstPoint
{
    @BeforeSuite
    public void setUpDrive()
    {
        System.out.println("Setting up the Browser Driver");
    }

    @BeforeClass
    public void message()
    {
        System.out.println("First point started");
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

    @Test( priority = 2,description = "Check if we go to friends section")
    public void goToFriends()
    {
        System.out.println("Going to friends section");
    }

    @Test(priority = 3, description = "Here we select a friend")
    @Parameters({"friend"})
    public void selectFriend(String friend)
    {
        System.out.println("Friend : "+friend+" selected");
    }

    @Test(priority = 4, description = "Delete friend")
    @Parameters({"friend"})
    public void deleteFriend(String friend)
    {
        System.out.println("Friend : "+friend+" was deleted");
    }

    @Test(priority = 5, description = "Log out")
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
