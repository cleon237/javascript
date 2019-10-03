async function loadUsers()
{
    //TODO Part 1 -> 4) implement this method using Fetch WEB API.
}

function addUserToTable( user )
{
    let node = document.createElement( "TR" );
    let idRowNode = document.createElement( "TH" );
    idRowNode.appendChild( document.createTextNode( user.id ) );
    let nameRowNode = document.createElement( "TD" );
    nameRowNode.appendChild( document.createTextNode( user.name ) );
    let birthDateRowNode = document.createElement( "TD" );
    birthDateRowNode.appendChild( document.createTextNode( user.birthDate ) );
    node.appendChild( idRowNode );
    node.appendChild( nameRowNode );
    node.appendChild( birthDateRowNode );
    document.getElementById( "table-body" ).appendChild( node );
}

function saveToLocalStorage( key, value )
{
    //TODO Part 2 -> 1) implement this method using Local Storage WEB API.
}

function loadUsersFromStorage()
{
    //TODO Part 2 -> 3) implement this method reading users data from Local Storage WEB API.
}






