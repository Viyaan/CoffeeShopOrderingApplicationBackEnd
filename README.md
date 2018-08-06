# CoffeeShopOrderingApplicationBackEnd
Ordering system in coffee shop.

1) user can register himself
2) User can login once he registers himself
3) Place order given by customer
4) View all the orders placed.
4) See the status of Order.


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
