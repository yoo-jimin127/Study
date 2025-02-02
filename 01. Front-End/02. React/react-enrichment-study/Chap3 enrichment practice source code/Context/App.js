import React from "react";
import ThemeContext from "./ThemeContext";

export const themes = {
    light: {
        foreground: '#000000',
        background: '#eeeeee',
    },
    dark: {
        foreground: '#ffffff',
        background: '#222222',
    }
}

export const ThemeContext = React.createContext(themes.dark);