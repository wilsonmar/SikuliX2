package com.sikulix.core;

import com.sikulix.api.Element;
import com.sikulix.api.Picture;

import java.awt.Rectangle;

public class RemoteDevice implements IDevice {

  @Override
  public IDevice start(Object... args) {
    return null;
  }

  @Override
  public void stop() {

  }

  @Override
  public int getNumberOfMonitors() {
    return 0;
  }

  @Override
  public Rectangle getMonitor(int... id) {
    return null;
  }

  @Override
  public Rectangle getAllMonitors() {
    return null;
  }

  @Override
  public int getMonitorID() {
    return 0;
  }

  @Override
  public int getMonitorID(int id) {
    return 0;
  }

  @Override
  public void resetMonitors() {

  }

  @Override
  public Rectangle[] getMonitors() {
    return new Rectangle[0];
  }

  @Override
  public int getContainingMonitorID(Element element) {
    return 0;
  }

  @Override
  public Element getContainingMonitor(Element element) {
    return null;
  }

  @Override
  public Element click(Element loc) {
    return null;
  }

  @Override
  public Element doubleClick(Element loc) {
    return null;
  }

  @Override
  public Element rightClick(Element loc) {
    return null;
  }

  @Override
  public Element click(Action action) {
    return null;
  }

  @Override
  public Element click(Element loc, Action action) {
    return null;
  }

  @Override
  public Element dragDrop(Element from, Element to, Object... times) {
    return null;
  }

  @Override
  public Element move(int xoff, int yoff) {
    return null;
  }

  @Override
  public Element move(Element loc) {
    return null;
  }

  @Override
  public Element at() {
    return null;
  }

  @Override
  public void button(Action action) {

  }

  @Override
  public void wheel(Action action, int steps) {

  }

  @Override
  public Picture capture(Element what) {
    return null;
  }
}
