package com.shandysiswandi.restapi.controller;

import org.hibernate.TypeMismatchException;
import org.springframework.beans.ConversionNotSupportedException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.validation.method.MethodValidationException;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingPathVariableException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.ServletRequestBindingException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.annotation.HandlerMethodValidationException;
import org.springframework.web.multipart.support.MissingServletRequestPartException;
import org.springframework.web.servlet.NoHandlerFoundException;
import org.springframework.web.servlet.resource.NoResourceFoundException;

import com.shandysiswandi.restapi.exception.ConflictException;
import com.shandysiswandi.restapi.exception.ForbiddenException;
import com.shandysiswandi.restapi.exception.UnauthorizeException;
import com.shandysiswandi.restapi.model.RestResponse;

import jakarta.validation.ConstraintViolationException;

@RestControllerAdvice
public class ErrorController {

        @ExceptionHandler({
                        MissingServletRequestParameterException.class,
                        MissingServletRequestPartException.class,
                        ServletRequestBindingException.class,
                        TypeMismatchException.class,
                        HttpMessageNotReadableException.class,
                        MethodArgumentNotValidException.class,
                        HandlerMethodValidationException.class,
        })
        public ResponseEntity<RestResponse<String>> badRequestException(Exception e) {
                var body = RestResponse.<String>builder()
                                .message("Bad Request")
                                .errors("Your request can't be proccess")
                                .build();
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(body);
        }

        @ExceptionHandler(UnauthorizeException.class)
        public ResponseEntity<RestResponse<String>> unauthorizationException(UnauthorizeException e) {
                var body = RestResponse.<String>builder()
                                .message("Unauthorized")
                                .errors(e.getMessage())
                                .build();
                return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(body);
        }

        @ExceptionHandler(ForbiddenException.class)
        public ResponseEntity<RestResponse<String>> forbiddenException(ForbiddenException e) {
                var body = RestResponse.<String>builder()
                                .message("Forbidden")
                                .errors(e.getMessage())
                                .build();
                return ResponseEntity.status(HttpStatus.FORBIDDEN).body(body);
        }

        @ExceptionHandler({ NoHandlerFoundException.class, NoResourceFoundException.class })
        public ResponseEntity<RestResponse<String>> notFoundException(Exception e) {
                var body = RestResponse.<String>builder()
                                .message("Not Found")
                                .errors("Resource not found")
                                .build();
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body(body);
        }

        @ExceptionHandler(HttpRequestMethodNotSupportedException.class)
        public ResponseEntity<RestResponse<String>> methodNotAllowException(HttpRequestMethodNotSupportedException e) {
                var body = RestResponse.<String>builder()
                                .message("Method Not Allowed")
                                .errors("The request method you used is not supported")
                                .build();
                return ResponseEntity.status(HttpStatus.METHOD_NOT_ALLOWED).body(body);
        }

        @ExceptionHandler(ConflictException.class)
        public ResponseEntity<RestResponse<String>> conflictException(ConflictException e) {
                var body = RestResponse.<String>builder()
                                .message("Conflict")
                                .errors(e.getMessage())
                                .build();
                return ResponseEntity.status(HttpStatus.CONFLICT).body(body);
        }

        @ExceptionHandler(HttpMediaTypeNotSupportedException.class)
        public ResponseEntity<RestResponse<String>> mediaTypeException(HttpMediaTypeNotSupportedException e) {
                var body = RestResponse.<String>builder()
                                .message("Unsupported Media Type")
                                .errors("The media type of your request is not supported")
                                .build();
                return ResponseEntity.status(HttpStatus.UNSUPPORTED_MEDIA_TYPE).body(body);
        }

        @ExceptionHandler(ConstraintViolationException.class)
        public ResponseEntity<RestResponse<String>> validationException(ConstraintViolationException e) {
                var body = RestResponse.<String>builder()
                                .message("Validation Fails")
                                .errors(e.getMessage())
                                .build();
                return ResponseEntity.status(HttpStatus.UNPROCESSABLE_ENTITY).body(body);
        }

        @ExceptionHandler({
                        MissingPathVariableException.class,
                        ConversionNotSupportedException.class,
                        HttpMessageNotWritableException.class,
                        MethodValidationException.class,
        })
        public ResponseEntity<RestResponse<String>> internalException(Exception e) {
                var body = RestResponse.<String>builder()
                                .message("General Error")
                                .errors("Sorry, an internal server error occurred. Please try again later")
                                .build();
                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(body);
        }

}
