def call(Map config) {
    def yaml = libraryResource('pod-templates/agent.yaml')
    def parseYaml = readYaml text: yaml
    //print parseYaml
    //parseYaml.spec.container[0].name = "overrided-name"
   
return parseYaml
}
