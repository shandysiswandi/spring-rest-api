# Auth API Spec

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
    "message": "Successfully"
  }
  ```

  - 409

  ```json
  {
    "message": "Conflict",
    "errors": "Username is exists"
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
      "expired_at": "123456789" // millisecond
    },
    "message": "Successfully"
  }
  ```

  - 429

  ```json
  {
    "message": "Too Many Requests",
    "errors": "Temporary block"
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
    "message": "Successfully"
  }
  ```
