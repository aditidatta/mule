/*
 * $Id$
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSource, Inc.  All rights reserved.  http://www.mulesource.com
 *
 * The software in this package is published under the terms of the BSD style
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.mule.transaction.constraints;

import org.mule.umo.UMOEvent;

/**
 * <code>ConstraintFilter</code> TODO
 * 
 * @author <a href="mailto:ross.mason@symphonysoft.com">Ross Mason</a>
 * @version $Revision$
 */

public class ConstraintFilter implements Cloneable
{
    public ConstraintFilter()
    {
        super();
    }

    public boolean accept(UMOEvent event)
    {
        return true;
    }

    public Object clone() throws CloneNotSupportedException
    {
        return new ConstraintFilter();
    }

}
