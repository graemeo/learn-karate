Feature: execute fake online rest API

Scenario: get post data from fake online rest API
Given url 'https://jsonplaceholder.typicode.com/posts/1'
When method get
Then match response.userId == 1
Then match response.title == 'sunt aut facere repellat provident occaecati excepturi optio reprehenderit'
