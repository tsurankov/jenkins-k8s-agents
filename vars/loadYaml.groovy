def call(Map config) {
    def yaml = libraryResource('pod-templates/agent.yaml')
    def parseYaml = readYaml text: yaml
    print parseYaml
    //writeYaml file: 'tmp.yaml', data: parseYaml
    def readResult = yamlToString(parseYaml)
    print readResult
return readResult
}
