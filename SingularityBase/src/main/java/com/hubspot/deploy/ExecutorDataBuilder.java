package com.hubspot.deploy;

import java.util.List;
import java.util.Map;

import com.google.common.base.Objects;
import com.google.common.base.Optional;

public class ExecutorDataBuilder {
  
  private String cmd;
  private List<EmbeddedArtifact> embeddedArtifacts;
  private List<ExternalArtifact> externalArtifacts;
  private List<S3Artifact> s3Artifacts;
  private List<Integer> successfulExitCodes;
  private Optional<String> runningSentinel;
  private Optional<String> user;
  private List<String> extraCmdLineArgs;
  private Optional<String> loggingTag;
  private Map<String, String> loggingExtraFields;
  private Optional<Long> sigKillProcessesAfterMillis;
  
  public ExecutorDataBuilder(String cmd, List<EmbeddedArtifact> embeddedArtifacts, List<ExternalArtifact> externalArtifacts, List<S3Artifact> s3Artifacts, List<Integer> successfulExitCodes, Optional<String> runningSentinel,
      Optional<String> user, List<String> extraCmdLineArgs, Optional<String> loggingTag, Map<String, String> loggingExtraFields, Optional<Long> sigKillProcessesAfterMillis) {
    this.cmd = cmd;
    this.embeddedArtifacts = embeddedArtifacts;
    this.externalArtifacts = externalArtifacts;
    this.s3Artifacts = s3Artifacts;
    this.successfulExitCodes = successfulExitCodes;
    this.runningSentinel = runningSentinel;
    this.user = user;
    this.extraCmdLineArgs = extraCmdLineArgs;
    this.loggingTag = loggingTag;
    this.loggingExtraFields = loggingExtraFields;
  }
  
  public ExecutorDataBuilder() {
    
  }
  
  public ExecutorData build() {
    return new ExecutorData(cmd, embeddedArtifacts, externalArtifacts, s3Artifacts, successfulExitCodes, user, runningSentinel, extraCmdLineArgs, loggingTag, loggingExtraFields, sigKillProcessesAfterMillis);
  }
  
  public Optional<String> getLoggingTag() {
    return loggingTag;
  }

  public ExecutorDataBuilder setLoggingTag(Optional<String> loggingTag) {
    this.loggingTag = loggingTag;
    return this;
  }

  public Map<String, String> getLoggingExtraFields() {
    return loggingExtraFields;
  }

  public ExecutorDataBuilder setLoggingExtraFields(Map<String, String> loggingExtraFields) {
    this.loggingExtraFields = loggingExtraFields;
    return this;
  }

  public String getCmd() {
    return cmd;
  }

  public List<EmbeddedArtifact> getEmbeddedArtifacts() {
    return embeddedArtifacts;
  }

  public List<ExternalArtifact> getExternalArtifacts() {
    return externalArtifacts;
  }

  public List<Integer> getSuccessfulExitCodes() {
    return successfulExitCodes;
  }

  public List<String> getExtraCmdLineArgs() {
    return extraCmdLineArgs;
  }

  public Optional<String> getRunningSentinel() {
    return runningSentinel;
  }

  public Optional<String> getUser() {
    return user;
  }

  public ExecutorDataBuilder setCmd(String cmd) {
    this.cmd = cmd;
    return this;
  }
  
  public Optional<Long> getSigKillProcessesAfterMillis() {
    return sigKillProcessesAfterMillis;
  }

  public ExecutorDataBuilder setSigKillProcessesAfterMillis(Optional<Long> sigKillProcessesAfterMillis) {
    this.sigKillProcessesAfterMillis = sigKillProcessesAfterMillis;
    return this;
  }

  public ExecutorDataBuilder setEmbeddedArtifacts(List<EmbeddedArtifact> embeddedArtifacts) {
    this.embeddedArtifacts = embeddedArtifacts;
    return this;
  }

  public ExecutorDataBuilder setExternalArtifacts(List<ExternalArtifact> externalArtifacts) {
    this.externalArtifacts = externalArtifacts;
    return this;
  }

  public ExecutorDataBuilder setSuccessfulExitCodes(List<Integer> successfulExitCodes) {
    this.successfulExitCodes = successfulExitCodes;
    return this;
  }

  public ExecutorDataBuilder setRunningSentinel(Optional<String> runningSentinel) {
    this.runningSentinel = runningSentinel;
    return this;
  }

  public ExecutorDataBuilder setUser(Optional<String> user) {
    this.user = user;
    return this;
  }

  public ExecutorDataBuilder setExtraCmdLineArgs(List<String> extraCmdLineArgs) {
    this.extraCmdLineArgs = extraCmdLineArgs;
    return this;
  }
  
  public List<S3Artifact> getS3Artifacts() {
    return s3Artifacts;
  }

  public ExecutorDataBuilder setS3Artifacts(List<S3Artifact> s3Artifacts) {
    this.s3Artifacts = s3Artifacts;
    return this;
  }

  @Override
  public String toString() {
    return Objects.toStringHelper(this)
        .add("cmd", cmd)
        .add("embeddedArtifacts", embeddedArtifacts)
        .add("externalArtifacts", externalArtifacts)
        .add("s3Artifacts", s3Artifacts)
        .add("user", user)
        .add("successfulExitCodes", successfulExitCodes)
        .add("runningSentinel", runningSentinel)
        .add("extraCmdLineArgs", extraCmdLineArgs)
        .add("loggingTag", loggingTag)
        .add("loggingExtraFields", loggingExtraFields)
        .add("sigKillProcessesAfterMillis", sigKillProcessesAfterMillis)
        .toString();
  }
}
