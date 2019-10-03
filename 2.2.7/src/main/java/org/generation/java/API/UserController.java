package org.generation.java.API;


import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController
{

    private final List<User> usersList = new ArrayList<>();


    @PostConstruct
    public void initSampleData()
    {
        usersList.add( new User( "102020", "Santiago Carrillo", "Sep 28 1986" ) );
        usersList.add( new User( "12312", "Andres Lopez", "Jul 15 1988" ) );
        usersList.add( new User( "123123", "Camilo Gomez", "Dic 28 1999" ) );
    }

    @RequestMapping( "/users" )
    public List<User> getUsersList()
    {
        return usersList;
    }

    @RequestMapping( name = "/user", method = RequestMethod.POST, consumes={"text/plain", "application/*"} )
    public void createUser( @RequestBody User user )
    {
        System.out.println( "User:  " + user );
        usersList.add( user );
    }

}
