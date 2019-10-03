package org.generation.java.API;

public class User
{

    private String id;

    private String name;

    private String birthDate;



    public User()
    {
    }

    public User( String id, String name, String birthDate )
    {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getName()
    {
        return name;
    }

    public void setName( String name )
    {
        this.name = name;
    }

    public String getBirthDate()
    {
        return birthDate;
    }

    public void setBirthDate( String birthDate )
    {
        this.birthDate = birthDate;
    }

    public String getId()
    {
        return id;
    }

    public void setId( String id )
    {
        this.id = id;
    }

    @Override
    public String toString()
    {
        return "User{" + "id='" + id + '\'' + ", name='" + name + '\'' + ", birthDate='" + birthDate + '\'' + '}';
    }
}
