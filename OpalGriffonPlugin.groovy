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

class OpalGriffonPlugin {
    // the plugin version
    String version = '0.1'
    // the version or versions of Griffon the plugin is designed for
    String griffonVersion = '1.1.0 > *'
    // the other plugins this plugin depends on
    Map dependsOn = [swt: '1.1.0']
    // resources that are included in plugin packaging
    List pluginIncludes = []
    // the plugin license
    String license = 'Eclipse Public License 1.0'
    // Toolkit compatibility. No value means compatible with all
    // Valid values are: swing, javafx, swt, pivot, qt
    List toolkits = ['swt']
    List platforms = []
    String documentation = ''
    String source = 'https://github.com/griffon/griffon-opal-plugin'

    List authors = [
        [
            name: 'Andres Almiray',
            email: 'aalmiray@yahoo.com'
        ]
    ]
    String title = 'Opal brings additional SWT components'
    String description = '''
Delivers additional SWT components provided by the [Opal library].

Usage
-----

The following nodes will become available on a View script upon installing this plugin

| *Node*                | *Type*                                                         |
| --------------------- | -------------------------------------------------------------- |
| angleSlider           | `org.mihalis.opal.angles.AngleSlider`                          |
| blurredPanel          | `org.mihalis.opal.panels.BlurredPanel`                         |
| breadcrumb            | `org.mihalis.opal.breadcrumb.Breadcrumb`                       |
| breadcrumbItem        | `org.mihalis.opal.breadcrumb.BreadcrumbItem`                   |
| brushedMetalComposite | `org.mihalis.opal.brushedMetalComposite.BrushedMetalComposite` |
| calculator            | `org.mihalis.opal.calculator.Calculator`                       |
| choiceWidget          | `org.mihalis.opal.opalDialog.ChoiceWidget`                     |
| columnBrowserWidget   | `org.mihalis.opal.columns.ColumnBrowserWidget`                 |
| columnItem            | `org.mihalis.opal.columns.ColumnItem`                          |
| darkPanel             | `org.mihalis.opal.panels.DarkPanel`                            |
| dualList              | `org.mihalis.opal.itemSelector.DualList`                       |
| dynamicTable          | `org.mihalis.opal.dynamictablecolumns.DynamicTable`            |
| dynamicTableColumn    | `org.mihalis.opal.dynamictablecolumns.DynamicTableColumn`      |
| flatButton            | `org.mihalis.opal.flatButton.FlatButton`                       |
| gradientComposite     | `org.mihalis.opal.gradientComposite.GradientComposite`         |
| header                | `org.mihalis.opal.header.Header`                               |
| heapManager           | `org.mihalis.opal.heapManager.HeapManager`                     |
| horizontalSpinner     | `org.mihalis.opal.horizontalSpinner.HorizontalSpinner`         |
| imageSelector         | `org.mihalis.opal.imageSelector.ImageSelector`                 |
| infiniteProgressPanel | `org.mihalis.opal.infinitePanel.InfiniteProgressPanel`         |
| launcher              | `org.mihalis.opal.launcher.Launcher`                           |
| multiChoice           | `org.mihalis.opal.multiChoice.MultiChoice`                     |
| obutton               | `org.mihalis.opal.obutton.OButton`                             |
| propertyTable         | `org.mihalis.opal.propertyTable.PropertyTable`                 |
| rangeSlider           | `org.mihalis.opal.rangeSlider.RangeSlider`                     |
| roundedToolItem       | `org.mihalis.opal.roundedToolbar.RoundedToolItem`              |
| roundedToolbar        | `org.mihalis.opal.roundedToolbar.RoundedToolbar`               |
| starRating            | `org.mihalis.opal.starRating.StarRating`                       |
| switchButton          | `org.mihalis.opal.switchButton.SwitchButton`                   |
| systemMonitor         | `org.mihalis.opal.systemMonitor.SystemMonitor`                 |
| titledSeparator       | `org.mihalis.opal.titledSeparator.TitledSeparator`             |
| transitionComposite   | `org.mihalis.opal.transitionComposite.TransitionComposite`     |

[1]: http://code.google.com/a/eclipselabs.org/p/opal/
'''
}
