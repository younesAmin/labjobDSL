pipelineJob('pipeline-with-DSL2') {
 description("this pipeline is created eith a jobDSL")
 definition {
  cpsScm {
    scm {
      git {
        remote {
          github('younesAmin/labjobDSL.git.git/')
        }
      }
    }
  }
 }
}
