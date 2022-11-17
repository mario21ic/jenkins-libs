def call(Map pipelineParams) {
    pipeline {
        agent any

        stages {
            stage('docker build') {
                steps {
                    script {
                        echo "dockerPipeline invocando a dockerLib"
                        dockerLib.build(DockerfilePath: pipelineParams.dockerfilePath,
                                        DockerImage: pipelineParams.dockerImage,
                                        DockerContext: pipelineParams.dockerContext)
                    }
                }
            }
            stage('docker push') {
                steps {
                    script {
                        echo "dockerPipeline xD"
                        dockerLib.push(DockerImage: pipelineParams.dockerImage)
                    }
                }
            }
        }
    }
}
