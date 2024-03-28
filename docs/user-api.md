# User API Spec

## Registration

description for this endpoint

- `METHOD`: POST
- `PATH`: /api/auth/registration
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

description for this endpoint

- `METHOD`: POST
- `PATH`: /api/auth/login
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


description for this endpoint

- `METHOD`: POST
- `PATH`: /api/auth/registration
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

## Get Profile


description for this endpoint

- `METHOD`: POST
- `PATH`: /api/auth/registration
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

## Get User By Username


description for this endpoint

- `METHOD`: POST
- `PATH`: /api/auth/registration
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

## Update User


description for this endpoint

- `METHOD`: POST
- `PATH`: /api/auth/registration
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

