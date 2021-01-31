def call(Map config) {
    def yaml = libraryResource('pod-templates/agent.yaml')
    def parseYaml = readYaml text: yaml
    // modify yaml
    String resultYaml = writeYaml returnText: true, data: parseYaml
return resultYaml
}
