pipelineJob('pipeline-with-DSL2') {
 description("this pipeline is created eith a jobDSL")
 definition {
  cpsScm {
    scm {
      git {
        remote {
          github('https://github.com/younesAmin/labjobDSL.git')
        }
      }
    }
  }
 }
}
