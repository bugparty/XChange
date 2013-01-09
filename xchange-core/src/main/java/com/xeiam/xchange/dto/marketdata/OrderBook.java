/**
 * Copyright (C) 2012 - 2013 Xeiam LLC http://xeiam.com
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies
 * of the Software, and to permit persons to whom the Software is furnished to do
 * so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.xeiam.xchange.dto.marketdata;

import java.util.Collections;
import java.util.List;

import com.xeiam.xchange.dto.trade.LimitOrder;

/**
 * Data object representing OrderBook
 * 
 * @immutable
 */
public final class OrderBook {

  private final List<LimitOrder> asks;
  private final List<LimitOrder> bids;

  private ErrorMessage errorMessage;

  /**
   * Constructor
   * 
   * @param asks
   * @param bids
   */
  public OrderBook(List<LimitOrder> asks, List<LimitOrder> bids) {

    this.asks = asks;
    this.bids = bids;
  }

  public List<LimitOrder> getAsks() {

    Collections.sort(asks);
    return asks;
  }

  public List<LimitOrder> getBids() {

    Collections.sort(bids);
    return bids;
  }

  public ErrorMessage getErrorMessage() {

    return errorMessage;
  }

  public void setErrorMessage(ErrorMessage errorMessage) {

    this.errorMessage = errorMessage;
  }

  @Override
  public String toString() {

    return "Depth [asks=" + asks.toString() + ", bids=" + bids.toString() + "]";
  }

}
