/*
 * Copyright (c) 2015 BlueSkyFish
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package kirchnerei.httpclient;

/**
 * A response of a http request
 */
public class HttpResponseResult implements HttpResponse {

    private final int statusCode;

    private final String content;

    private final long duration;

    HttpResponseResult(int statusCode, String content, long duration) {
        this.statusCode = statusCode;
        this.content = content;
        this.duration = duration;
    }

    @Override
    public int getStatusCode() {
        return statusCode;
    }

    @Override
    public String getContent() {
        return content;
    }

    @Override
    public long getDuration() {
        return duration;
    }

    @Override
    public boolean hasError() {
        return statusCode > Definition.STATUS_CODE_OKAY;
    }

    @Override
    public Throwable getError() {
        return null;
    }
}
