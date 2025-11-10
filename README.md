# Interstellar Coding Session

In this coding session it's required to adapt the provided codebase so that the acceptance criteria below are met.

## Overview

The codebase contains two folders:
- backend: contains already the `Product` entity with some basic attributes and the `ProductsRepository`
- frontend: it's a default project structure created by angular CLI

## Instructions

- web searches are allowed
- using AI chatbots is not allowed
- any library can be imported and used if considered useful
- general coding best practices must be followed

## Backend

- the entity `Product` is adapted to store the creation date
- a REST endpoint is provided to request a paginated list of existing products
- a REST endpoint is provided to allow the deletion of a product by ID
- a product can be deleted only if it's price is <= 100.0

## Frontend

- a new `ProductsIndexPage` component exists which:
  - gets products from the REST APIs
  - shows them in a paginated table with the following columns:
    - id
    - name
    - price
    - creation date
  - allows to delete a product by clicking on the corresponding row
- a route `/products` exists which exposes a component showing a paginated table of products
- when navigating to the home page, the user is redirected to the products page