FROM swaggerapi/swagger-codegen-cli:2.4.8

COPY target/swagger-code-generator-node-typescript-1.0.0.jar codegen.jar

ENTRYPOINT ["java", "-cp", "codegen.jar:/opt/swagger-codegen-cli/swagger-codegen-cli.jar", "io.swagger.codegen.SwaggerCodegen", "generate", "-l", "node-typescript"]