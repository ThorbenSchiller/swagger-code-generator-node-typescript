# Swagger Codegen for updated node typescript client

## Overview
Code Generator for generating a node API Client in Typescript.
This Code generator uses the `typescript-node` as base.

Changes:
* Add tslint and eslint disable comment
* Remove <any> typings for enums

## Example
To generate an api client, use a temporary container:
```shell script
docker run --rm \
-v "$(pwd)/output:/swagger-output" \
-v "$(pwd)/definition:/swagger-input:ro" \
registry.gitlab.com/thorbens/swagger-code-generator-node-typescript \
--additional-properties=supportsES6=true -i /swagger-input/swagger.yaml -o /swagger-output
```

All additional arguments are passed to the `generate` action from the default
[swagger-codegen](https://github.com/swagger-api/swagger-codegen#getting-started) library.
