/*******************************************************************************
 * Copyright (c) 2012 Andres Almiray
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Andres Almiray - initial implementation
 *******************************************************************************/

import griffon.util.ApplicationHolder;
import groovy.swt.factory.WidgetFactory;
import org.codehaus.griffon.runtime.core.AbstractGriffonAddon;
import org.eclipse.swt.SWT;
import org.mihalis.opal.angles.AngleSlider;
import org.mihalis.opal.breadcrumb.Breadcrumb;
import org.mihalis.opal.breadcrumb.BreadcrumbItem;
import org.mihalis.opal.brushedMetalComposite.BrushedMetalComposite;
import org.mihalis.opal.calculator.Calculator;
import org.mihalis.opal.columns.ColumnBrowserWidget;
import org.mihalis.opal.columns.ColumnItem;
import org.mihalis.opal.dynamictablecolumns.DynamicTable;
import org.mihalis.opal.dynamictablecolumns.DynamicTableColumn;
import org.mihalis.opal.flatButton.FlatButton;
import org.mihalis.opal.gradientComposite.GradientComposite;
import org.mihalis.opal.header.Header;
import org.mihalis.opal.heapManager.HeapManager;
import org.mihalis.opal.horizontalSpinner.HorizontalSpinner;
import org.mihalis.opal.imageSelector.ImageSelector;
import org.mihalis.opal.infinitePanel.InfiniteProgressPanel;
import org.mihalis.opal.itemSelector.DualList;
import org.mihalis.opal.launcher.Launcher;
import org.mihalis.opal.multiChoice.MultiChoice;
import org.mihalis.opal.obutton.OButton;
import org.mihalis.opal.opalDialog.ChoiceWidget;
import org.mihalis.opal.panels.BlurredPanel;
import org.mihalis.opal.panels.DarkPanel;
import org.mihalis.opal.propertyTable.PropertyTable;
import org.mihalis.opal.rangeSlider.RangeSlider;
import org.mihalis.opal.roundedToolbar.RoundedToolItem;
import org.mihalis.opal.roundedToolbar.RoundedToolbar;
import org.mihalis.opal.starRating.StarRating;
import org.mihalis.opal.switchButton.SwitchButton;
import org.mihalis.opal.systemMonitor.SystemMonitor;
import org.mihalis.opal.titledSeparator.TitledSeparator;
import org.mihalis.opal.transitionComposite.TransitionComposite;

/**
 * @author Andres Almiray
 */
public class OpalGriffonAddon extends AbstractGriffonAddon {
    public OpalGriffonAddon() {
        super(ApplicationHolder.getApplication());
        factories.put("angleSlider", new WidgetFactory(AngleSlider.class));
        factories.put("blurredPanel", new WidgetFactory(BlurredPanel.class));
        factories.put("breadcrumb", new WidgetFactory(Breadcrumb.class));
        factories.put("breadcrumbItem", new WidgetFactory(BreadcrumbItem.class));
        factories.put("brushedMetalComposite", new WidgetFactory(BrushedMetalComposite.class));
        factories.put("calculator", new WidgetFactory(Calculator.class));
        factories.put("choiceWidget", new WidgetFactory(ChoiceWidget.class));
        // factories.put("checkBoxGroup", new CheckBoxGroupFactory());
        factories.put("columnBrowserWidget", new WidgetFactory(ColumnBrowserWidget.class));
        factories.put("columnItem", new WidgetFactory(ColumnItem.class));
        factories.put("darkPanel", new WidgetFactory(DarkPanel.class));
        factories.put("dualList", new WidgetFactory(DualList.class));
        factories.put("dynamicTable", new WidgetFactory(DynamicTable.class, SWT.BORDER | SWT.FULL_SELECTION));
        factories.put("dynamicTableColumn", new WidgetFactory(DynamicTableColumn.class));
        factories.put("flatButton", new WidgetFactory(FlatButton.class, SWT.CENTER));
        factories.put("gradientComposite", new WidgetFactory(GradientComposite.class));
        factories.put("header", new WidgetFactory(Header.class));
        factories.put("heapManager", new WidgetFactory(HeapManager.class));
        factories.put("horizontalSpinner", new WidgetFactory(HorizontalSpinner.class, SWT.FLAT));
        factories.put("imageSelector", new WidgetFactory(ImageSelector.class));
        factories.put("infiniteProgressPanel", new WidgetFactory(InfiniteProgressPanel.class));
        factories.put("launcher", new WidgetFactory(Launcher.class));
        factories.put("multiChoice", new WidgetFactory(MultiChoice.class));
        factories.put("obutton", new WidgetFactory(OButton.class, SWT.PUSH));
        factories.put("propertyTable", new WidgetFactory(PropertyTable.class, SWT.BORDER));
        factories.put("rangeSlider", new WidgetFactory(RangeSlider.class));
        factories.put("roundedToolbar", new WidgetFactory(RoundedToolbar.class));
        factories.put("roundedToolItem", new WidgetFactory(RoundedToolItem.class));
        factories.put("starRating", new WidgetFactory(StarRating.class));
        factories.put("switchButton", new WidgetFactory(SwitchButton.class));
        factories.put("systemMonitor", new WidgetFactory(SystemMonitor.class));
        // factories.put("textAssist", new TextAssistFactory());
        factories.put("titledSeparator", new WidgetFactory(TitledSeparator.class));
        factories.put("transitionComposite", new WidgetFactory(TransitionComposite.class));
    }
}