def build(Map params){
    echo "build - myvar: ${this.env.MYVAR}"
    echo "build - myvar: ${MYVAR}"

    //sh "docker build -f ${params.DockerfilePath} -t ${params.DockerImage} ${params.DockerArgs} ${params.DockerContext}"
    echo "docker build -f ${params.DockerfilePath} -t ${params.DockerImage} ${params.DockerArgs} ${params.DockerContext}"
}

def push(Map params){
    echo "push - myvar: ${this.env.MYVAR}"
    echo "push - myvar: ${MYVAR}"

    sh "./scripts/demo.sh"

    //sh "docker push ${params.DockerImage}"
    echo "docker push ${params.DockerImage}"
}

def promoter(Map params){
    sh "docker pull ${params.DockerImage}"
    sh "docker tag ${params.DockerImage} ${params.DockerNewImage}"
    sh "docker push ${params.DockerNewImage}"
}
