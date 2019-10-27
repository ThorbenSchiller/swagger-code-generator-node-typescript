package de.thorbens.swagger.codegen;

import io.swagger.codegen.languages.TypeScriptNodeClientCodegen;

import java.util.Arrays;
import java.util.List;

public class NodeTypescriptGenerator extends TypeScriptNodeClientCodegen {
    public NodeTypescriptGenerator() {
        super();

        // set the output folder here
        outputFolder = "generated-code/node-typescript";
        // This is the location which templates will be read from. The generator
        // will use the resource stream to attempt to read the templates.
        templateDir = "node-typescript";
        // set to null to use templateDir
        embeddedTemplateDir = null;
    }

    public void processOpts() {
        super.processOpts();
        // remove unused files
        final List<String> removeFiles = Arrays.asList("git_push.sh.mustache", "gitignore");
        this.supportingFiles.removeIf(file -> removeFiles.contains(file.templateFile));
    }

    @Override
    public String getName() {
        return "node-typescript";
    }
}