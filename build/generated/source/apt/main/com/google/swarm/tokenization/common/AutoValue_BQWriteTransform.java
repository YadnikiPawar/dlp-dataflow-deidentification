

package com.google.swarm.tokenization.common;

import javax.annotation.Generated;
import javax.annotation.Nullable;
import org.apache.beam.sdk.io.gcp.bigquery.BigQueryIO;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_BQWriteTransform extends BQWriteTransform {

  private final Integer batchFrequency;

  private final BigQueryIO.Write.Method method;

  private final String tableSpec;

  private AutoValue_BQWriteTransform(
      @Nullable Integer batchFrequency,
      BigQueryIO.Write.Method method,
      String tableSpec) {
    this.batchFrequency = batchFrequency;
    this.method = method;
    this.tableSpec = tableSpec;
  }

  @Nullable
  @Override
  public Integer batchFrequency() {
    return batchFrequency;
  }

  @Override
  public BigQueryIO.Write.Method method() {
    return method;
  }

  @Override
  public String tableSpec() {
    return tableSpec;
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof BQWriteTransform) {
      BQWriteTransform that = (BQWriteTransform) o;
      return ((this.batchFrequency == null) ? (that.batchFrequency() == null) : this.batchFrequency.equals(that.batchFrequency()))
           && (this.method.equals(that.method()))
           && (this.tableSpec.equals(that.tableSpec()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= (batchFrequency == null) ? 0 : batchFrequency.hashCode();
    h$ *= 1000003;
    h$ ^= method.hashCode();
    h$ *= 1000003;
    h$ ^= tableSpec.hashCode();
    return h$;
  }

  static final class Builder extends BQWriteTransform.Builder {
    private Integer batchFrequency;
    private BigQueryIO.Write.Method method;
    private String tableSpec;
    Builder() {
    }
    @Override
    public BQWriteTransform.Builder setBatchFrequency(Integer batchFrequency) {
      this.batchFrequency = batchFrequency;
      return this;
    }
    @Override
    public BQWriteTransform.Builder setMethod(BigQueryIO.Write.Method method) {
      if (method == null) {
        throw new NullPointerException("Null method");
      }
      this.method = method;
      return this;
    }
    @Override
    public BQWriteTransform.Builder setTableSpec(String tableSpec) {
      if (tableSpec == null) {
        throw new NullPointerException("Null tableSpec");
      }
      this.tableSpec = tableSpec;
      return this;
    }
    @Override
    public BQWriteTransform build() {
      String missing = "";
      if (this.method == null) {
        missing += " method";
      }
      if (this.tableSpec == null) {
        missing += " tableSpec";
      }
      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_BQWriteTransform(
          this.batchFrequency,
          this.method,
          this.tableSpec);
    }
  }

}
