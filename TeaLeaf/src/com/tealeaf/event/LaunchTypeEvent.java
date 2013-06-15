/* @license
 * This file is part of the Game Closure SDK.
 *
 * The Game Closure SDK is free software: you can redistribute it and/or modify
 * it under the terms of the Mozilla Public License v. 2.0 as published by Mozilla.

 * The Game Closure SDK is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * Mozilla Public License v. 2.0 for more details.

 * You should have received a copy of the Mozilla Public License v. 2.0
 * along with the Game Closure SDK.  If not, see <http://mozilla.org/MPL/2.0/>.
 */
package com.tealeaf.event;

public class LaunchTypeEvent extends com.tealeaf.event.Event {
	@SuppressWarnings("unused")
	private String type;
	@SuppressWarnings("unused")
	private String data;

	public LaunchTypeEvent(String type) {
		super("launchType");
		this.type = type;
	}
	
	public LaunchTypeEvent(String type, String data) {
		this(type);
		this.data = data;
	}
}
