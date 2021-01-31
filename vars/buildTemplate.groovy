def call (Map config) {
def buildImage = config.buildImage ?: 'maven:latest'
yaml = """
---
apiVersion: v1
kind: Pod
metadata:
  labels:
    some-label: build-maven
spec:
  containers:
  - name: build
    image: ${buildImage}
    command:
    - cat
    tty: true
"""
return yaml
}
