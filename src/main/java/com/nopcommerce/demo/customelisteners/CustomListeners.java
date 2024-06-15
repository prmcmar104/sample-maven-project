package com.nopcommerce.demo.customelisteners;

import com.nopcommerce.demo.utilities.Utility;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

/**
 * Created by Jay Vaghani
 */
public class CustomListeners implements ITestListener {
    @Override
    public void onTestStart(ITestResult result) {
    }

    @Override
    public void onTestSuccess(ITestResult result) {
    }

    @Override
    public void onTestFailure(ITestResult result) {
        // This step take screenshot and store in to test-output/html folder
        String screenshotName = Utility.takeScreenShot(result.getName());
        //This line Required for  ReportNG reports
        System.setProperty("org.uncommons.reportng.escape-output", "false");
        // Attach the Screenshot
        Reporter.log("Click to see screenshot");
        Reporter.log("<a target = \"_blank\" href=" + screenshotName + ">Screenshot</a>");
        Reporter.log("<br>");
        Reporter.log("<br>");
        Reporter.log("<a target = \"_blank\" href=" + screenshotName + "><img src=" + screenshotName + " height=200 width=200></img></a>");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
    }

    @Override
    public void onStart(ITestContext context) {
    }

    @Override
    public void onFinish(ITestContext context) {
    }
}
