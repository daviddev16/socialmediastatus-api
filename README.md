<h1>Social Media Status API</h1>


This API is used for monitoring status and health check of [Social Media API](https://github.com/GabrielBrisson/SocialMediaAPI).


<h2>Installation</h2>


Clone the repository: 
```
git clone https://github.com/daviddev16/socialmediastatus-api
```

Build and Run with Docker:
```
cd socialmediastatus-api
docker build -t daviddev16/socialmediastatus-api .
docker run -p 5002:5002 daviddev16/socialmediastatus-api
```
<h2>Usage</h2>

```GET: http://localhost:5002/devops/api/status```

<h2>License</h2>
This project is licensed under the MIT License.
