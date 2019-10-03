# 2.2.7 Exercises - JavaScript Web APIs (120 minutes)




### Part 1 Project Based Learning - Fetch API
1) Install the following extension on Firefox:
https://addons.mozilla.org/en-US/firefox/addon/cors-everywhere/

2) Download the project and start the server using mvn:

```zsh
  mvn spring-boot:run
```
3) Test the server is running correctly by accessing the users service:
http://localhost:8080/users


4) Implement the loadUsers() function(use the fetch Web API to call the endpoint to retrieve the users list from)
https://developer.mozilla.org/en-US/docs/Web/API/Fetch_API/Using_Fetch)

5) Iterate the users list from the response and use the function addUserToTable()
to display the users web page.

### Part 2 Project Based Learning - Local Storage API
1) Implement the saveToLocalStorage(key, value) function using the Local Storage API:

https://developer.mozilla.org/en-US/docs/Web/API/Window/localStorage

2) Save the users list to the local storage after downloaded 
3) Implement the loadUsersFromStorage() so when the page is loaded and the users are saved on the Local Storage then data is shown in the table without calling the loadUsers() function.

4) Explain why the application works offline and where is the data loaded.


### Non Technical Reflection 
Discuss why the application works offline and where is the data loaded.

### Present to your Peers
Present your final project to the classmates and compare your results.
