# Okteto

Free kubernetes cluster to develop applications

## Documentation

[Docs](https://www.okteto.com/docs/welcome/overview/)

## Quotas

| Resource   | Value     |
|------------|-----------|
| Namespaces | 5         |
| Pods       | 10        |
| CPU        | 1 / pod   |
| Memory     | 3Gi / pod |
| Storage    | 5Gi       |

## Install and configure Okteto CLI

```shell
$ curl https://get.okteto.com -sSfL | sh
$ okteto context use https://cloud.okteto.com
```

## Build and deploy application

### Docker

#### Build the app’s container image

```sh
$ docker build . -t mateuszjanczak/example-app
```

#### Start an app container

```sh
$ docker run -p 8080:8080 -d mateuszjanczak/example-app
```

#### Push the image

```sh
$ docker image push mateuszjanczak/example-app
```

### Kubernetes

#### Create a deployment

```sh
$ kubectl apply -f deployment.yaml
```

#### Create a service

```sh
$ kubectl apply -f service.yaml
```