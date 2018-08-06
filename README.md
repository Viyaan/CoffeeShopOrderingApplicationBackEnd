# CoffeeShopOrderingApplicationBackEnd
Ordering system in coffee shop.

1) user can register himself
2) User can login once he registers himself
3) Place order given by customer
4) View all the orders placed.
4) See the status of Order.

# Technology Stack

+ **Spring Boot** Spring Boot makes it easy to create stand-alone, production-grade Spring based Applications that you can "just run".
 
 ![H2 logo](https://upload.wikimedia.org/wikipedia/en/2/20/Pivotal_Java_Spring_Logo.png)
 
## Database? 

+ **H2** is a relational database management system written in Java. It can be embedded in Java applications or run in the client-server mode.


![H2 logo](http://anote-project.org/wiki/images/a/ab/H2-logo-2.png)



### "Development" and Testing

We use Heroku for all our development deployment.
It's a **by _far_ the most time-effective** way to "_ship_" <br />
the project and get it _tried & tested_ by _real_ people.
Using heroku is like having a "Dedicated DevOps" person
on the team. <br />
Once the deployment is configured we can automatically deploy
a _new version_ of app for each feature and test incrementally.<br />
This alone is worth the _modest_ fee Heroku charges for their service!
<br >

> If you are _completely_ `new` to Heroku you can get started
in 10 minutes with our <br />
***complete beginner's tutorial***: https://github.com/dwyl/learn-heroku <br />

# REST API


**Register User**
----
  Returns json data about a single user.

* **URL**

  /registration

* **Method:**

  'POST'
  
*  **URL Params**

   **Required:**
 
  

* **Data Params**

  None

* **Success Response:**

  * **Code:** 200 <br />
    **Content:** `{ id : 12, name : "Michael Bloom" }`
 
* **Error Response:**

  * **Code:** 404 NOT FOUND <br />
    **Content:** `{ error : "User doesn't exist" }`

  OR

  * **Code:** 401 UNAUTHORIZED <br />
    **Content:** `{ error : "You are unauthorized to make this request." }`

* **Sample Call:**

  ```javascript
    $.ajax({
      url: "/users/1",
      dataType: "json",
      type : "GET",
      success : function(r) {
        console.log(r);
      }
    });
  ```


