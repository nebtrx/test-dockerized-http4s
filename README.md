# test-dockerized-http4s

```
$ sbt docker:publishLocal
```

```
$ docker run -p 8080:8080 --rm test-dockerized-http4s:0.0.1-SNAPSHOT

```

```
$ curl http://localhost:8080/hello/stranger
```
