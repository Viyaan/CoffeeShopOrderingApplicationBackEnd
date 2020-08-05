# CoffeeShopOrderingApplicationBackEnd
Ordering system in coffee shop.

1) user can register himself
2) User can login once he registers himself
3) Place order given by customer
4) View all the orders placed.
4) See the status of Order.

Steps to Execute:
1)npm install --save
2)Go to browser: http://localhost:4200




# Technology Stack

+ **Spring Boot** Spring Boot makes it easy to create stand-alone, production-grade Spring based Applications that you can "just run".
 
 ![H2 logo](https://upload.wikimedia.org/wikipedia/en/2/20/Pivotal_Java_Spring_Logo.png)
 
 + **Angular JS** 
AngularJS extends HTML with new attributes.
AngularJS is perfect for Single Page Applications (SPAs).
AngularJS is easy to learn..
 
 + **BOOTSTRAP** 
Bootstrap is the most popular HTML, CSS, and JavaScript framework for developing responsive, mobile-first websites.
 
## Database? 

+ **H2** is a relational database management system written in Java. It can be embedded in Java applications or run in the client-server mode.


![H2 logo](http://anote-project.org/wiki/images/a/ab/H2-logo-2.png)

+ **H2 URL**  localhost:8080/h2


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

**Swagger** Swagger is an open source software framework backed by a large ecosystem of tools that helps developers design, build, document, and consume RESTful Web services.

![Swagger logo](https://upload.wikimedia.org/wikipedia/commons/thumb/a/ab/Swagger-logo.png/150px-Swagger-logo.png)

+ **Swagger URL** localhost:8080/swagger-ui.html

**Register User**
----
  Returns json data about a single user.

* **URL**

  /registration

* **Method:**

  'POST'
  
*  **URL Params**
	'User' 

   **Required:**
 
  

* **Data Params**

  None

* **Success Response:**

  * **Code:** 200 <br />
    **Content:** `{ "User has been registered successfully" }`
 
* **Error Response:**

  * **Code:** 404 NOT FOUND <br />
    **Content:** ` "User doesn't exist" `

  OR

  * **Code:** 401 UNAUTHORIZED <br />
    **Content:** `"You are unauthorized to make this request." `



**Login API**
----
  Returns response Entity  when User tries to login.

* **URL**

  /login

* **Method:**

  'POST'
  
*  **URL Params**
	'Login' 

   **Required:**
 
  

* **Data Params**

  None

* **Success Response:**

  * **Code:** 200 <br />
    **Content:** `"Authenticated" `
 
* **Error Response:**

  * **Code:** 404 NOT FOUND <br />
    **Content:** ` "User does not Exist, Please register yourself"`

  OR

  * **Code:** 401 UNAUTHORIZED <br />
    **Content:** `"Password Mismatch" `


**Place Order API**
----
   This api is used to place an order

* **URL**

  /place-order

* **Method:**

  'POST'
  
*  **URL Params**
	'OrderPlaced' 

   **Required:**
 
  

* **Data Params**

  None

* **Success Response:**

  * **Code:** 200 <br />
    **Content:** `Order has been taken successfully`
    
 



**Menu API**
----
  This api is used to given list of all items in an menu

* **URL**

  /menu

* **Method:**

  'GET'
  
*  **URL Params**
	'' 

   **Required:**
 
  

* **Data Params**

  None

* **Success Response:**

  * **Code:** 200 <br />
    **Content:** `[
  {
    "menuId": 1,
    "item": "IDLI",
    "price": 20
  },
  {
    "menuId": 2,
    "item": "DOSA",
    "price": 40
  }]`
 

    
    
    **ORDERS API**
----
  This api is used to given fetch all the orders being placed

* **URL**

  /orders

* **Method:**

  'GET'
  
*  **URL Params**
	'' 

   **Required:**
 
  

* **Data Params**

  None

* **Success Response:**

  * **Code:** 200 <br />
    **Content:** `[
  {
    "orderId": 1,
    "items": [
      {
        "itemId": 2,
        "itemName": "Dosa1",
        "price": 301,
        "quantity": 1
      }
    ],
    "tokenNo": 25,
    "status": "ORDER_PLACED"
  }
]`
 
  ```

## Authors

* **Viyaan Jhiingade** 

See also the list of [contributors](https://github.com/your/project/contributors) who participated in this project.
