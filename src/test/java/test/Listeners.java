package test;

import org.testng.ITestListener;
import org.testng.ITestResult;

//ITestListener interface which implements TestNG listeners
public class Listeners implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {

    }

    @Override
    public void onTestSuccess(ITestResult result) {
        //System.out.println("I successfully executed Listeners Pass code");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        //screenshot code
        //response if API is failed
        System.out.println("I failed executing Listeners Pass code" + result.getName());
    }

    @Override
    public void onTestSkipped(ITestResult result) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

//    @Override
//    public void onStart(ITestResult result) {
//
//    }
//
//    @Override
//    public void onFinish(ITestResult result) {
//
//    }

}
