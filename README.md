# GraphqlPOC
GraphQL is a query language and runtime for APIs that was developed by Facebook and later open-sourced. It offers several advantages over traditional REST APIs, and its adoption has grown in recent years for various reasons:

1. **Efficient Data Fetching:**
    - **Single Request:** With GraphQL, clients can request only the data they need, and they receive all the requested data in a single response. This eliminates over-fetching or under-fetching of data.
    - **Reduced Overhead:** Unlike REST, where multiple endpoints might be required to fulfill different use cases, GraphQL allows clients to specify the structure of the response, reducing unnecessary data transfer.

2. **Flexible Data Modeling:**
    - **Client-Specified Queries:** Clients have the flexibility to request exactly the data they need, and the server responds accordingly. This reduces the need for multiple API versions to accommodate different client requirements.
    - **Nested Data Retrieval:** GraphQL allows clients to retrieve nested data in a single query, enabling more complex data structures and reducing the number of requests needed.

3. **Strong Typing and Introspection:**
    - **Type System:** GraphQL uses a strong typing system to define the data schema. This provides clarity on the data structure, making it easier for developers to understand and work with the API.
    - **Introspection:** GraphQL supports introspection, allowing clients to query the schema itself. This feature is useful for documentation and tooling, making it easier to explore and understand the API.

4. **Real-time Data with Subscriptions:**
    - **Real-time Updates:** GraphQL supports subscriptions, enabling real-time updates to clients when data changes on the server. This is beneficial for applications that require live or near-real-time data.

5. **Reduced Over-fetching and Under-fetching:**
    - **Custom Responses:** Clients can specify the shape and structure of the response, eliminating over-fetching of unnecessary data and under-fetching of required data.

6. **Backend Aggregation:**
    - **Single Endpoint:** GraphQL APIs typically expose a single endpoint, simplifying the management and configuration of the API. This is in contrast to REST APIs, which often require multiple endpoints for different resources.

7. **Better Developer Experience:**
    - **Autocomplete and Documentation:** GraphQL tools provide autocomplete suggestions during development, and the schema itself serves as comprehensive documentation for the available types and queries.

8. **Ecosystem and Community:**
    - **Growing Ecosystem:** The GraphQL ecosystem is continually growing, with a variety of tools, libraries, and frameworks available for different programming languages.
    - **Community Support:** GraphQL has a vibrant and active community, which contributes to its ongoing development and improvement.

While GraphQL offers numerous benefits, its adoption should be considered based on the specific needs and requirements of a project. It may be particularly advantageous for applications with complex data requirements, dynamic UIs, and a need for efficient data fetching.

## Getting started
This POC demonstrates how to use GraphQL APIs. To run this POC locally, please follow the instructions below.

### Make graphqls file into resourese

- Generate a GraphQL configuration file in your project's resources (`.graphqls` file).

### Postman curl  for creating new book
```
curl --location 'http://localhost:8009/graphql' 
        --header 'Content-Type: application/json'  
        --data '{
        "query": "mutation {
        createBook(bookInput: {
        title:  "1984 ",
        description:  "A dystopian novel set in a totalitarian society, depicting the dangers of surveillance and government control. ",
        author:  "George Orwell ",
        price: 10.99,
        pages: 328
        }) { 
        id
        title
        description
        author
        price
        pages
        }
        }",
        "variables": {}
        }'

```


### Postman curl  for fetch all books  detail
```
curl --location 'http://localhost:8009/graphql' \
--header 'Content-Type: application/json' \
--data '{
  "query": "query {
    getAllBooks {
      id
      title
      author
    }
  }",
  "variables": {}
}'

```


### Postman curl  for fetch spcific books  detail
```
curl --location 'http://localhost:8009/graphql' \
--header 'Content-Type: application/json' \
--data '{
  "query": "query {
    getBookById(bookId: 1) {
      id
      title
      description
    }
  }",
  "variables": {}
}'

```