

package com.google.swarm.tokenization.common;

import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_DLPTransform extends DLPTransform {

  private final String inspectTemplateName;

  private final String projectId;

  private AutoValue_DLPTransform(
      String inspectTemplateName,
      String projectId) {
    this.inspectTemplateName = inspectTemplateName;
    this.projectId = projectId;
  }

  @Override
  public String inspectTemplateName() {
    return inspectTemplateName;
  }

  @Override
  public String projectId() {
    return projectId;
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof DLPTransform) {
      DLPTransform that = (DLPTransform) o;
      return (this.inspectTemplateName.equals(that.inspectTemplateName()))
           && (this.projectId.equals(that.projectId()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= inspectTemplateName.hashCode();
    h$ *= 1000003;
    h$ ^= projectId.hashCode();
    return h$;
  }

  static final class Builder extends DLPTransform.Builder {
    private String inspectTemplateName;
    private String projectId;
    Builder() {
    }
    @Override
    public DLPTransform.Builder setInspectTemplateName(String inspectTemplateName) {
      if (inspectTemplateName == null) {
        throw new NullPointerException("Null inspectTemplateName");
      }
      this.inspectTemplateName = inspectTemplateName;
      return this;
    }
    @Override
    public DLPTransform.Builder setProjectId(String projectId) {
      if (projectId == null) {
        throw new NullPointerException("Null projectId");
      }
      this.projectId = projectId;
      return this;
    }
    @Override
    public DLPTransform build() {
      String missing = "";
      if (this.inspectTemplateName == null) {
        missing += " inspectTemplateName";
      }
      if (this.projectId == null) {
        missing += " projectId";
      }
      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_DLPTransform(
          this.inspectTemplateName,
          this.projectId);
    }
  }

}
