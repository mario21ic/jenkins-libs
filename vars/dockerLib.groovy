def build(Map params){
    //echo "myvar: ${this.env.MYVAR}"
    //sh "docker build -f ${params.DockerfilePath} -t ${params.DockerImage} ${params.DockerArgs} ${params.DockerContext}"
    echo "docker build -f ${params.DockerfilePath} -t ${params.DockerImage} ${params.DockerArgs} ${params.DockerContext}"
}

def push(Map params){
    //sh "docker push ${params.DockerImage}"
    //echo "myvar: ${this.env.MYVAR}"
    echo "docker push ${params.DockerImage}"
}

def promoter(Map params){
    sh "docker pull ${params.DockerImage}"
    sh "docker tag ${params.DockerImage} ${params.DockerNewImage}"
    sh "docker push ${params.DockerNewImage}"
}
