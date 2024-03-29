# Common Error Response

---

- Status Code : `400`
- Response Body :
  ```json
  {
    "message": "Bad Request",
    "errors": "Your request can't be proccess"
  }
  ```

---

- Status Code : `401`
- Response Body :
  ```json
  {
    "message": "Unauthorized",
    "errors": "invalid credential" // The various error messages
  }
  ```

---

- Status Code : `404`
- Response Body :
  ```json
  {
    "message": "Not Found",
    "errors": "Resource not found" // The various error messages
  }
  ```

---

- Status Code : `405`
- Response Body :
  ```json
  {
    "message": "Method Not Allowed",
    "errors": "The request method you used is not supported"
  }
  ```

---

- Status Code : `415`
- Response Body :
  ```json
  {
    "message": "Unsupported Media Type",
    "errors": "The media type of your request is not supported"
  }
  ```

---

- Status Code : `422`
- Response Body :
  ```json
  {
    "message": "Validation Fails",
    "errors": "field: must not be blank, ..." // The various error messages
  }
  ```

---

- Status Code : `500`
- Response Body :
  ```json
  {
    "message": "General Error",
    "errors": "Sorry, an internal server error occurred. Please try again later."
  }
  ```

---
