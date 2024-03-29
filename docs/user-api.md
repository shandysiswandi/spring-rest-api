# User API Spec

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
    "message": "Successfully"
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
    "message": "Successfully"
  }
  ```

  - 403

  ```json
  {
    "message": "Forbidden",
    "errors": "You dont have access"
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
    "message": "Successfully"
  }
  ```

  - 403

  ```json
  {
    "message": "Forbidden",
    "errors": "You dont have access"
  }
  ```

  - 409

  ```json
  {
    "message": "Conflict",
    "errors": "Username is exists"
  }
  ```
