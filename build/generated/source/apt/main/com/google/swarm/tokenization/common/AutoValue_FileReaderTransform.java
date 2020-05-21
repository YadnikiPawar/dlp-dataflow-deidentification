

package com.google.swarm.tokenization.common;

import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_FileReaderTransform extends FileReaderTransform {

  private final String subscriber;

  private final Integer batchSize;

  private AutoValue_FileReaderTransform(
      String subscriber,
      Integer batchSize) {
    this.subscriber = subscriber;
    this.batchSize = batchSize;
  }

  @Override
  public String subscriber() {
    return subscriber;
  }

  @Override
  public Integer batchSize() {
    return batchSize;
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof FileReaderTransform) {
      FileReaderTransform that = (FileReaderTransform) o;
      return (this.subscriber.equals(that.subscriber()))
           && (this.batchSize.equals(that.batchSize()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= subscriber.hashCode();
    h$ *= 1000003;
    h$ ^= batchSize.hashCode();
    return h$;
  }

  static final class Builder extends FileReaderTransform.Builder {
    private String subscriber;
    private Integer batchSize;
    Builder() {
    }
    @Override
    public FileReaderTransform.Builder setSubscriber(String subscriber) {
      if (subscriber == null) {
        throw new NullPointerException("Null subscriber");
      }
      this.subscriber = subscriber;
      return this;
    }
    @Override
    public FileReaderTransform.Builder setBatchSize(Integer batchSize) {
      if (batchSize == null) {
        throw new NullPointerException("Null batchSize");
      }
      this.batchSize = batchSize;
      return this;
    }
    @Override
    public FileReaderTransform build() {
      String missing = "";
      if (this.subscriber == null) {
        missing += " subscriber";
      }
      if (this.batchSize == null) {
        missing += " batchSize";
      }
      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_FileReaderTransform(
          this.subscriber,
          this.batchSize);
    }
  }

}
