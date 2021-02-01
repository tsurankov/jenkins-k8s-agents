def call(Map config) {
    def yaml = libraryResource('pod-templates/agent.yaml')
    def parseYaml = readYaml text: yaml
    // modify yaml

    // Has not been released yet https://issues.jenkins.io/browse/JENKINS-63719
    // String resultYaml = writeYaml returnText: true, data: parseYaml
return resultYaml
}
