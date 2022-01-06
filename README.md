# api-rest-kotlin

## Technologies
. Kotlin <br/>
. Spring webflux <br/>
. Docker <br/>
. Mongo DB <br/>

## Run application
. Pull docker image Mongo: `docker pull mongo` <br/>
. Run MongoDB on port `27017` <br/>
. On directory application, build with docker to create image: `docker build -t api-kotlin` <br/>
. So finally, start the container: `docker run -dp 8080:8080 api-kotlin` <br/>
