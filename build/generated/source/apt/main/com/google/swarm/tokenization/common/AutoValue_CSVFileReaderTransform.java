

package com.google.swarm.tokenization.common;

import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_CSVFileReaderTransform extends CSVFileReaderTransform {

  private final String csvFilePattern;

  private AutoValue_CSVFileReaderTransform(
      String csvFilePattern) {
    this.csvFilePattern = csvFilePattern;
  }

  @Override
  public String csvFilePattern() {
    return csvFilePattern;
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof CSVFileReaderTransform) {
      CSVFileReaderTransform that = (CSVFileReaderTransform) o;
      return (this.csvFilePattern.equals(that.csvFilePattern()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= csvFilePattern.hashCode();
    return h$;
  }

  static final class Builder extends CSVFileReaderTransform.Builder {
    private String csvFilePattern;
    Builder() {
    }
    @Override
    public CSVFileReaderTransform.Builder setCsvFilePattern(String csvFilePattern) {
      if (csvFilePattern == null) {
        throw new NullPointerException("Null csvFilePattern");
      }
      this.csvFilePattern = csvFilePattern;
      return this;
    }
    @Override
    public CSVFileReaderTransform build() {
      String missing = "";
      if (this.csvFilePattern == null) {
        missing += " csvFilePattern";
      }
      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_CSVFileReaderTransform(
          this.csvFilePattern);
    }
  }

}
