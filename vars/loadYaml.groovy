def call(Map config) {
    def yaml = libraryResource('pod-templates/agent.yaml')
    def parseYaml = readYaml text: yaml
    print parseYaml
    writeYaml file: 'tmp.yaml', data: parseYaml
    def readResult = new File('tmp.yaml').text
    print readResult
return readResult
}
