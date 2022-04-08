import {Tabs, Tab} from '@material-ui/core'
import AccountCircleSharpIcon from '@material-ui/icons/AccountCircleSharp'
import { useCallback, useState } from 'react'

import './Menu.css'

export const Menu = () => {
    const [pageSelected, setTableSected] = useState(0)

    const handleChange = useCallback((e: React.ChangeEvent<{}>, newValue: number) => {
        setTableSected(newValue)
    },[])

    return(
        <div className="menu-container">
            <Tabs value={pageSelected} onChange={handleChange}>
                <Tab label="Lançamentos"/>
                <Tab label="Favoritos"/>
                <Tab label="Carrinho"/>
                <Tab label={<div className='login-tab'><AccountCircleSharpIcon/><span>Entrar</span></div>} />
            </Tabs>
        </div>
    )
}