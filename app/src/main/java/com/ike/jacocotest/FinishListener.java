package com.ike.jacocotest;

public interface FinishListener {
  void onActivityFinished();
  void dumpIntermediateCoverage(String filePath);
}