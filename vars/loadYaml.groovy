def call(Map config) {
    def yaml = libraryResource('pod-templates/agent.yaml')
    def parseYaml = readYaml text: yaml
    print parseYaml
    def readResult = writeYaml returnText: true, data: parseYaml
    print readResult
return readResult
}
