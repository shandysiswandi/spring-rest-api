# User API Spec

## Registration

Endpoint to register a new user.

- `METHOD`: POST
- `PATH`: /api/auth/registration
- `Request Header`:

  ```
  Content-type: application/json; charset=utf-8
  ```

- `Request Body`:

  ```json
  {
    "name": "full name",
    "username": "username",
    "password": "password"
  }
  ```

- `Response Body`:

  - 200

  ```json
  {
    "result": true,
    "message": "Succesfully"
  }
  ```

  - 400

  ```json
  {
    "message": "Bad Request",
    "errors": "request cannot be decode"
  }
  ```

  - 409

  ```json
  {
    "message": "Conflict",
    "errors": "Username is exists"
  }
  ```

  - 422

  ```json
  {
    "message": "Validation Fails",
    "errors": "Username must be unique, Username ...."
  }
  ```

  - 500

  ```json
  {
    "message": "General Error",
    "errors": "Sorry, an internal server error occurred. Please try again later."
  }
  ```

---

## Login

Endpoint to authenticate a user.

- `METHOD`: POST
- `PATH`: /api/auth/login
- `Request Header`:

  ```
  Content-type: application/json; charset=utf-8
  ```

- `Request Body`:

  ```json
  {
    "username": "username",
    "password": "password"
  }
  ```

- `Response Body`:

  - 200

  ```json
  {
    "result": {
      "token": "ay....",
      "type": "Bearer",
      "expired": "123456789" // millisecond
    },
    "message": "Succesfully"
  }
  ```

  - 400

  ```json
  {
    "message": "Bad Request",
    "errors": "request cannot be decode"
  }
  ```

  - 401

  ```json
  {
    "message": "Unauthorized",
    "errors": "Invalid Credencial"
  }
  ```

  - 429

  ```json
  {
    "message": "Too Many Requests",
    "errors": "Temporary block"
  }
  ```

  - 500

  ```json
  {
    "message": "General Error",
    "errors": "Sorry, an internal server error occurred. Please try again later."
  }
  ```

---

## Logout

Endpoint to logout current session.

- `METHOD`: DELETE
- `PATH`: /api/auth/logout
- `Request Header`:

  ```
  Authorization: Bearer ay......
  ```

- `Request Body`:

  ```json
  none
  ```

- `Response Body`:

  - 200

  ```json
  {
    "result": true,
    "message": "Succesfully"
  }
  ```

  
  - 401

  ```json
  {
    "message": "Unauthorized",
    "errors": "Invalid Credencial"
  }
  ```

  - 500

  ```json
  {
    "message": "General Error",
    "errors": "Sorry, an internal server error occurred. Please try again later."
  }
  ```

---

## Get Profile

Endpoint to get current user.

- `METHOD`: GET
- `PATH`: /api/users/profile
- `Request Header`:

  ```
  Authorization: Bearer ay......
  ```

- `Request Body`:

  ```
  none
  ```

- `Response Body`:

  - 200

  ```json
  {
    "result": {
      "username": "username",
      "name": "full name",
      "id": 1
    },
    "message": "Succesfully"
  }
  ```

  - 401

  ```json
  {
    "message": "Unauthorized",
    "errors": "Invalid Token"
  }
  ```

  - 500

  ```json
  {
    "message": "General Error",
    "errors": "Sorry, an internal server error occurred. Please try again later."
  }
  ```

---

## Get User By Username

Endpoint to get a user by username.

- `METHOD`: GET
- `PATH`: /api/users/:username
- `Request Header`:

  ```
  Authorization: Bearer ay......
  ```

- `Request Body`:

  ```
  none
  ```

- `Response Body`:

  - 200

  ```json
  {
    "result": {
      "username": "username",
      "name": "full name",
      "id": 1
    },
    "message": "Succesfully"
  }
  ```

  - 401

  ```json
  {
    "message": "Unauthorized",
    "errors": "Invalid Token"
  }
  ```

  - 403

  ```json
  {
    "message": "Forbidden",
    "errors": "You dont have access"
  }
  ```

  - 500

  ```json
  {
    "message": "General Error",
    "errors": "Sorry, an internal server error occurred. Please try again later."
  }
  ```

---

## Update User

Endpoint to partial update a user.

- `METHOD`: PATCH
- `PATH`: /api/users/:id
- `Request Header`:

  ```
  Authorization: Bearer ay......
  Content-type: application/json; charset=utf-8
  ```

- `Request Body`:

  ```json
  {
    "name": "full name",
    "username": "username"
  }
  ```

- `Response Body`:

  - 200

  ```json
  {
    "result": true,
    "message": "Succesfully"
  }
  ```

  - 400

  ```json
  {
    "message": "Bad Request",
    "errors": "request cannot be decode"
  }
  ```

  - 409

  ```json
  {
    "message": "Conflict",
    "errors": "Username is exists"
  }
  ```

  - 422

  ```json
  {
    "message": "Validation Fails",
    "errors": "Username must be unique, Username ...."
  }
  ```

  - 500

  ```json
  {
    "message": "General Error",
    "errors": "Sorry, an internal server error occurred. Please try again later."
  }
  ```
